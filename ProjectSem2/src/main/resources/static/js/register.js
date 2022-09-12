function printError(Id, Msg) {
    document.getElementById(Id).innerHTML = Msg;
}

function validateForm() {

    var username = document.Form.username.value;
    var email = document.Form.email.value;
    var password = document.Form.password.value;

    var usernameErr = emailErr = passwordErr = true;


    if(username == "") {
        printError("usernameErr", "Please enter your username");
        var elem = document.getElementById("username");
        elem.classList.add("input-2");
        elem.classList.remove("input-1");
    } else {
        var regex = /^.{6,}$/;
        if(regex.test(username) === false) {
            printError("usernameErr", "Please enter username at least 6 characters");
            var elem = document.getElementById("username");
            elem.classList.add("input-2");
            elem.classList.remove("input-1");
        } else {
            printError("usernameErr", "");
            usernameErr = false;
            var elem = document.getElementById("username");
            elem.classList.add("input-1");
            elem.classList.remove("input-2");
        }
    }

    if(email == "") {
        printError("emailErr", "Please enter your email");
        var elem = document.getElementById("email");
        elem.classList.add("input-2");
        elem.classList.remove("input-1");

    } else {
        var regex = /^\S+@\S+\.\S+$/;
        if(regex.test(email) === false) {
            printError("emailErr", "Email invalidate");
            var elem = document.getElementById("email");
            elem.classList.add("input-2");
            elem.classList.remove("input-1");
        } else {
            printError("emailErr", "");
            emailErr = false;
            var elem = document.getElementById("email");
            elem.classList.add("input-1");
            elem.classList.remove("input-2");
        }
    }

    if(password == "") {
        printError("passwordErr", "Please enter your password");
        var elem = document.getElementById("password");
        elem.classList.add("input-2");
        elem.classList.remove("input-1");
    } else {

        var regex = /^.{6,}$/;
        if(regex.test(password) === false) {
            printError("passwordErr", "Please enter password at least 6 characters");
            var elem = document.getElementById("password");
            elem.classList.add("input-2");
            elem.classList.remove("input-1");
        } else{
            printError("passwordErr", "");
            passwordErr = false;
            var elem = document.getElementById("password");
            elem.classList.add("input-1");
            elem.classList.remove("input-2");

        }
    }

    if((usernameErr || emailErr || passwordErr  ) == true) {
        return false;
    }
};