-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- 생성 시간: 24-04-01 17:41
-- 서버 버전: 8.0.36
-- PHP 버전: 8.2.17

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- 데이터베이스: `hyedal95`
--

-- --------------------------------------------------------

--
-- 테이블 구조 `vue_kurly_signup`
--



CREATE TABLE `vue_kurly_signup` (
  `userId` varchar(16) COLLATE utf8mb4_general_ci NOT NULL COMMENT '아이디',
  `userPw` varchar(16) COLLATE utf8mb4_general_ci NOT NULL COMMENT '비밀번호',
  `userName` varchar(30) COLLATE utf8mb4_general_ci NOT NULL COMMENT '이름',
  `userEmail` varchar(250) COLLATE utf8mb4_general_ci NOT NULL COMMENT '이메일',
  `userHp` varchar(13) COLLATE utf8mb4_general_ci NOT NULL COMMENT '전화번호',
  `userAddr1` varchar(250) COLLATE utf8mb4_general_ci NOT NULL COMMENT '주소1',
  `userAddr2` varchar(250) COLLATE utf8mb4_general_ci NOT NULL COMMENT '주소2',
  `userGender` varchar(4) COLLATE utf8mb4_general_ci NOT NULL COMMENT '성별',
  `userBirth` varchar(10) COLLATE utf8mb4_general_ci NOT NULL COMMENT '생년월일',
  `userChooga` varchar(100) COLLATE utf8mb4_general_ci NOT NULL COMMENT '추가입력사항',
  `userService` varchar(250) COLLATE utf8mb4_general_ci NOT NULL COMMENT '이용약관동의'
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='마켓컬리 회원가입폼';
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
