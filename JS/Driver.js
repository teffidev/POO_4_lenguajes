class Driver extends Account {

    constructor(name, document){
        super(name, document)
    }

    printDataDriver() {
        console.log(`Nombre ${this.name}`);
        console.log(`Documento: ${this.document}`);
    }

}