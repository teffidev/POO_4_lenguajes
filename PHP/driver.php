<?php
class Driver extends Account {

    public function __construct($name, $document){
        parent :: __construct($name, $document);
    }

    public function printDataDriver() {
        echo "Name: " $this->name,
        "Document: " $this->document;
    }    
}
?>