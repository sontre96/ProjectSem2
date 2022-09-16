function printError(Id, Msg) {
    document.getElementById(Id).innerHTML = Msg;
}

function validateForm() {

    var name = document.Form.name.value;
    var phone = document.Form.phone.value;
    var orderDate = document.Form.orderDate.value;
    var specialtyId = document.Form.specialtyId.value;
    var examinationTimeId = document.Form.examinationTimeId.value;
    var examinationPriceId = document.Form.examinationPriceId.value;
    var nameErr = phoneErr = orderDateErr = specialtyIdErr = examinationTimeIdErr = examinationPriceIdErr = true;


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

    if(orderDate == "") {
        printError("orderDateErr", "Please enter date of examination");
        var elem = document.getElementById("orderDate");
        elem.classList.add("input-2");
        elem.classList.remove("input-1");
    } else {
        var regex = /^(0[1-9]|[12][0-9]|3[01])-(0[1-9]|1[0-2])-\d{4}$/;
        if(regex.test(orderDate) === false) {
            printError("orderDateErr", "Please enter date by dd-MM-yyyy");
            var elem = document.getElementById("orderDate");
            elem.classList.add("input-2");
            elem.classList.remove("input-1");
        } else{
            printError("orderDateErr", "");
            orderDateErr = false;
            var elem = document.getElementById("orderDate");
            elem.classList.add("input-1");
            elem.classList.remove("input-2");
        }
    }

    if(specialtyId == "Choose Specialty") {
        printError("specialtyIdErr", "Please choose Specialty");
        var elem = document.getElementById("specialtyId");
        elem.classList.add("input-4");
        elem.classList.remove("input-3");
    } else {
        printError("specialtyIdErr", "");
        specialtyIdErr = false;
        var elem = document.getElementById("specialtyId");
        elem.classList.add("input-3");
        elem.classList.remove("input-4");
    }


    if(examinationTimeId == "Choose time booking schedule") {
        printError("examinationTimeIdErr", "Please choose time booking schedule");
        var elem = document.getElementById("examinationTimeId");
        elem.classList.add("input-4");
        elem.classList.remove("input-3");
    } else {
        printError("examinationTimeIdErr", "");
        examinationTimeIdErr = false;
        var elem = document.getElementById("examinationTimeId");
        elem.classList.add("input-3");
        elem.classList.remove("input-4");
    }

    if(examinationPriceId == "Choose examination service") {
        printError("examinationPriceIdErr", "Please choose examination service");
        var elem = document.getElementById("examinationPriceId");
        elem.classList.add("input-4");
        elem.classList.remove("input-3");
    } else {
        printError("examinationPriceIdErr", "");
        examinationPriceIdErr = false;
        var elem = document.getElementById("examinationPriceId");
        elem.classList.add("input-3");
        elem.classList.remove("input-4");
    }


    if((nameErr || phoneErr || orderDateErr || specialtyIdErr || examinationTimeIdErr || examinationPriceIdErr) == true) {
        return false;
    }
};