<?php
require_once('Car.php');
require_once('Account.php');
require_once('UberX.php');
require_once('UberVan.php');
require_once('UberPool.php');
require_once('User.php');


$car = new Car("AW456", new Account("Andres Herrera", "AMS123"));
$car->printDataCar();

$UberX = new UberX("CVB321", new Account("carlos Solares", "AND897"), "Chevrolet", "Spark");
$UberX->printDataCar();

$UberPool = new UberPool("TYU567", new Account("Pablo Ferrari", "END236"), "Dodge", "Attitude");
$UberPool->printDataCar();

$User = new User("Kerubin Linares", "SFK3030");
$UberPool->printDataCar();

$uberVan = new UberVan("OJL395", new Account("Raúl Ramírez", "AND456"), "Nissan", "Versa");
$uberVan->setPassenger(6);
$uberVan->printDataCar();

$uberX = new UberX("CVB123", new Account("Andres Herrera", "AND456"), "Chevrolet", "Spark");
$uberX->setPassenger(4);
$uberX->printDataCar();

?> 