document.addEventListener("DOMContentLoaded", function(){
    var button = document.querySelector("input[type=submit]");

    button.addEventListener("onclick", function (evt) {
        alert("Dodano książkę");
    })
})