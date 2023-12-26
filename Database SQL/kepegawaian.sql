-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 26 Des 2023 pada 07.34
-- Versi server: 10.4.24-MariaDB
-- Versi PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `kepegawaian`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `cuti`
--

CREATE TABLE `cuti` (
  `nama` varchar(30) NOT NULL,
  `awal_cuti` varchar(30) NOT NULL,
  `akhir_cuti` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `cuti`
--

INSERT INTO `cuti` (`nama`, `awal_cuti`, `akhir_cuti`) VALUES
('Andi', '10 Desember 2023', '18 Desember 2023'),
('Budi', '08 Desember 2023', '15 Desember 2023');

-- --------------------------------------------------------

--
-- Struktur dari tabel `gaji`
--

CREATE TABLE `gaji` (
  `nama` varchar(30) NOT NULL,
  `gaji_pokok` varchar(30) NOT NULL,
  `bonus` varchar(30) NOT NULL,
  `potongan` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `gaji`
--

INSERT INTO `gaji` (`nama`, `gaji_pokok`, `bonus`, `potongan`) VALUES
('Andi', '7.000.000', '500.000', '200.000'),
('Budi', '5.000.000', '300.000', '100.000');

-- --------------------------------------------------------

--
-- Struktur dari tabel `identitas`
--

CREATE TABLE `identitas` (
  `id` varchar(30) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `jenis_kelamin` varchar(30) NOT NULL,
  `agama` varchar(30) NOT NULL,
  `alamat` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `identitas`
--

INSERT INTO `identitas` (`id`, `nama`, `jenis_kelamin`, `agama`, `alamat`) VALUES
('001', 'Budi', 'Laki-Laki', 'Islam', 'Jl. A. Yani'),
('002', 'Andi', 'Laki-Laki', 'Islam', 'Jl. Cemara');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `cuti`
--
ALTER TABLE `cuti`
  ADD PRIMARY KEY (`nama`);

--
-- Indeks untuk tabel `gaji`
--
ALTER TABLE `gaji`
  ADD PRIMARY KEY (`nama`);

--
-- Indeks untuk tabel `identitas`
--
ALTER TABLE `identitas`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
