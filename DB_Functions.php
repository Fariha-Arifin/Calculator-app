<?php
class DB_Functions {
 
    private $conn;
 
    // constructor
    function __construct() {
        require_once 'DB_Connect.php';
        // connecting to database
        $db = new Db_Connect();
        $this->conn = $db->connect();
    }
 
    // destructor
    function __destruct() {
         
    }

/**
*Storing new user
*returns user details
*/
public function storeUser($FirstName,$LastName,$Email,$Guardians_Mobile_No,$National_ID_Card_No,$MobileNumber,$Password){

$stmt = $this->conn->prepare("INSERT INTO user_info(FirstName,LastName,Email,Guardians_Mobile_No,National_ID_Card_No,MobileNumber,Password) VALUES(?,?,?,?,?,?,?)");
$stmt->bind_param("sssssss",$FirstName,$LastName,$Email,$Guardians_Mobile_No,$National_ID_Card_No,$MobileNumber,$Password);
$result=$stmt->execute();
$stmt->close();



if($result){

 if($stmt=$this->conn->prepare("SELECT *FROM user_info WHERE MobileNumber= ?"))
 {
    $stmt->bind_param("s",$MobileNumber);
    $stmt->execute();
    $user=$stmt->get_result()->fetch_assoc();
    $stmt->close();

    return $user;
}
else
{
echo " DATABAse query error";

}
}
else{
return false;
	}
}

/**
*get user by mobileNumber and password
*/

public function getUserByMobileNumberAndPassword($MobileNumber,$Password){

$stmt=$this->conn->prepare("SELECT * FROM user_info WHERE MobileNumber= ?");
$stmt->bind_param("s",$MobileNumber);

if($stmt->execute()){
		$user=$stmt->get_result()->fetch_assoc();
		$stmt->close();

//verifying user password-

	$server_Password=$user['Password'];

//check for password equality

	if($server_Password==$Password){

//user authentication details are correct

	return $user;

	}
   }
else{

return NULL;
	}
  }

public function getUserByMobileNumber($MobileNumber){
$stmt=$this->conn->prepare("SELECT * FROM user_info WHERE MobileNumber = ?");
$stmt->bind_param("s",$MobileNumber);

	if($stmt->execute()){
$user= $stmt->get_result()->fetch_assoc();
$stmt->close();
return $user;
	}



else{
return NULL;
	}
 }

/**
*check user is existed or not
*/


public function isUserExisted($MobileNumber){

$stmt=$this->conn->prepare("SELECT MobileNumber from user_info WHERE MobileNumber=?");
$stmt->bind_param("s",$MobileNumber);
$stmt->execute();
$stmt->store_result();

	if($stmt->num_rows>0){
//user existed
	$stmt->close();
return true;
}
else{
//user not existed 
$stmt->close();
return false;
	}
}

public function getAllUser(){
$stmt=$this->conn->prepare("SELECT * FROM user_info");

	if($stmt->execute()){
$rows=array();
$result=$stmt->get_result();
while($r=$result->fetch_assoc()){

$rows[]=$r;
}

print json_encode($rows);
$stmt->close();
}
 else{

return NULL;

}
}


}
?>