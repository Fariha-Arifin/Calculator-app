<?php
require_once 'DB_Functions.php';
$db = new DB_Functions();

//json response array
$response=array("error" => FALSE);

if(isset($_GET['FirstName']) && isset($_GET['LastName']) && isset($_GET['Email']) && isset($_GET['Guardians_Mobile_No']) && isset($_GET['National_ID_Card_No']) && isset($_GET['MobileNumber'])&&isset($_GET['Password'])){

//receiving   the post params
	$FirstName=$_GET['FirstName'];
	$LastName=$_GET['LastName'];
	
	$Email=$_GET['Email'];
	$Guardians_Mobile_No=$_GET['Guardians_Mobile_No'];
	$National_ID_Card_No=$_GET['National_ID_Card_No'];
	$MobileNumber=$_GET['MobileNumber'];
	$Password=$_GET['Password'];
	
	

//check if user is already existed with the same phone number

	if($db->isUserExisted($MobileNumber)){
        //user already existed
	
$response["error"] = TRUE;
$response["error_msg"] = "User already existed with".$MobileNumber;
echo json_encode($response);
}

else{


//create a new user
$user=$db->storeUser($FirstName,$LastName,$Email,$Guardians_Mobile_No,$National_ID_Card_No,$MobileNumber,$Password);
if($user){

	$response["error"] = FALSE;
	$response["user_info"]["User_ID"]= $user["User_ID"];
	$response["user_info"]["FirstName"]= $user["FirstName"];
	$response["user_info"]["LastName"]= $user["LastName"];
	$response["user_info"]["Email"]= $user["Email"];
	$response["user_info"]["Guardians_Mobile_No"]= $user["Guardians_Mobile_No"];
	$response["user_info"]["National_ID_Card_No"]= $user["National_ID_Card_No"];
	$response["user_info"]["MobileNumber"]= $user["MobileNumber"];
	$response["user_info"]["Password"]= $user["Password"];
	

	
echo json_encode($response);

}
else{
//user failed to store

	$response["error"]=TRUE;
	$response["error_msg"]="Unknown error occured in registration!";
	echo json_encode($response);
    }

    }
  }
else{
	$response["error"]=TRUE;
	$response["error_msg"]="Required parameters(FirstName,LastName,Email,Local_Guardians_Name,Guardians_Mobile_No,Birth_Certificate_No,National_ID_Card_No,MobileNumber,Password,Area,House,Flat,Road)is missing";
	echo json_encode($response);
}


?>