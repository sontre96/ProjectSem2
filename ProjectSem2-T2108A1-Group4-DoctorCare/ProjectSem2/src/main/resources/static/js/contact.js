function printError(Id, Msg) {
    document.getElementById(Id).innerHTML = Msg;
}

function validateForm() {

    var name = document.Form.name.value;
    var phone = document.Form.phone.value;
    var email = document.Form.email.value;
    var note = document.Form.note.value;


    var nameErr = phoneErr = emailErr = noteErr = true;


    if(name == "") {
        printError("nameErr", "Please enter your name");
        var elem = document.getElementById("name");
        elem.classList.add("input-2");
        elem.classList.remove("input-1");
    } else {
        printError("nameErr", "");
        nameErr = false;
        var elem = document.getElementById("name");
        elem.classList.add("input-1");
        elem.classList.remove("input-2");

    }

    if(phone == "") {
        printError("phoneErr", "Please enter your phone number");
        var elem = document.getElementById("phone");
        elem.classList.add("input-2");
        elem.classList.remove("input-1");
    } else {
        var regex = /^[0-9]\d{9}$/;
        if(regex.test(phone) === false) {
            printError("phoneErr", "Please enter a valid 10 digit phone number");
            var elem = document.getElementById("phone");
            elem.classList.add("input-2");
            elem.classList.remove("input-1");
        } else{
            printError("phoneErr", "");
            phoneErr = false;
            var elem = document.getElementById("phone");
            elem.classList.add("input-1");
            elem.classList.remove("input-2");
        }
    }


    if(email == "") {
        printError("emailErr", "Please enter your email address");
        var elem = document.getElementById("email");
        elem.classList.add("input-2");
        elem.classList.remove("input-1");
    } else {

        var regex = /^\S+@\S+\.\S+$/;
        if(regex.test(email) === false) {
            printError("emailErr", "Please enter a valid email address");
            var elem = document.getElementById("email");
            elem.classList.add("input-2");
            elem.classList.remove("input-1");
        } else{
            printError("emailErr", "");
            emailErr = false;
            var elem = document.getElementById("email");
            elem.classList.add("input-1");
            elem.classList.remove("input-2");

        }
    }


    if(note == "") {
        printError("noteErr", "Please enter your note");
        var elem = document.getElementById("note");
        elem.classList.add("input-2");
        elem.classList.remove("input-1");
    } else {
        printError("noteErr", "");
        noteErr = false;
        var elem = document.getElementById("note");
        elem.classList.add("input-1");
        elem.classList.remove("input-2");
    }



    if((nameErr || phoneErr || emailErr || noteErr ) == true) {
        return false;
    }
};