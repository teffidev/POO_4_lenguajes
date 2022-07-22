class User extends Account {

    constructor(name, document){
        super(name, document)
    }

    printDataUser() {
        console.log(`Nombre ${this.name}`);
        console.log(`Documento: ${this.document}`);
    }
}