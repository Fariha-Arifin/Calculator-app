-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 17, 2019 at 05:47 PM
-- Server version: 10.1.29-MariaDB
-- PHP Version: 7.1.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `travel`
--

-- --------------------------------------------------------

--
-- Table structure for table `user_info`
--

CREATE TABLE `user_info` (
  `FirstName` varchar(100) NOT NULL,
  `LastName` varchar(100) NOT NULL,
  `Email` varchar(100) NOT NULL,
  `Guardians_Mobile_No` varchar(100) NOT NULL,
  `National_ID_Card_No` int(27) DEFAULT NULL,
  `MobileNumber` varchar(15) NOT NULL,
  `Password` varchar(13) NOT NULL,
  `User_ID` int(17) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user_info`
--

INSERT INTO `user_info` (`FirstName`, `LastName`, `Email`, `Guardians_Mobile_No`, `National_ID_Card_No`, `MobileNumber`, `Password`, `User_ID`) VALUES
('fariha', 'arifin', 'f@gmail.com', '5646454', 456566, '01957441914', '12345', 1),
('fgg', 'fdgdh', 'a@gmailc', '6647', 345354, '01944350970', '12345', 5),
('era', 'arifin', 'aaa@gmail.com', '94857456', 345435, '01679783507', '12345', 6),
('dfg', 'rdgfdg', 'add@gmail.com', '435', 0, '011', '1234', 7),
('dffd', 'ff', 'aa@gamil.com', '424234', 0, '123', '12345', 8),
('fg', 'fsdff', 'aasa@gmal.com', '2323', 0, '0112233', '1234', 9),
('fdg', 'fgfd', 'ss@gmail.com', '32324', 0, '01912', '12345', 10),
('fdf', 'fsdfds', 'sdf@yahoo.com', '34345', 34324, '0181', '1234', 11),
('f', 'f', 'g@gmail.com', '123456', 123456, '01234567890', '1234', 12),
('era', 'era', 'e@gmail.com', '123456', 1234567, '01122334455', '1234', 14);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `user_info`
--
ALTER TABLE `user_info`
  ADD PRIMARY KEY (`User_ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `user_info`
--
ALTER TABLE `user_info`
  MODIFY `User_ID` int(17) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
