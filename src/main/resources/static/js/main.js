function GerarMatricula() {
    var txt = "ACA";
    var aleatorio = Math.floor(Math.random() * 999);
    const date = new Date();
    var data = date.getFullYear();
    document.getElementById('matricula').value = (txt + data + aleatorio);
}