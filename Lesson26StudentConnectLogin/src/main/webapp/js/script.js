function validateForm() {
  var errorCounter = 0;

  // errorCounter += validateName();
  // errorCounter += validateSurname();
  // errorCounter += validateUsername();
  errorCounter += validateEmail();
  errorCounter += validatePass();
  errorCounter += validateRepeatPass();
  // errorCounter += validateBrthday();

  if (errorCounter > 0) {
    return false;
  }

  return true;
}

// function validateName() {
//   var errorCounter = 0;
//   var nameFld = document.getElementById("name");
//   var nameErr = document.getElementById("nameError");
//
//   if (nameFld.value.length <= 0) {
//     nameFld.style.background = '#ce0505';
//     nameErr.style.display = "block";
//     nameErr.style.color = "#ce0505";
//     errorCounter++;
//   } else {
//     nameFld.style.background = '#106c10';
//     nameErr.style.display = "none";
//   }
//   return errorCounter;
// }

// function validateUsername() {
//   var errorCounter = 0;
//   var surnameFld = document.getElementById("username");
//   var surnameErr = document.getElementById("usernameError");
//
//   if (surnameFld.value.length <= 0) {
//     surnameFld.style.background = '#ce0505';
//     surnameErr.style.display = "block";
//     surnameErr.style.color = "#ce0505";
//     errorCounter++;
//   } else {
//     surnameFld.style.background = '#106c10';
//     surnameErr.style.display = "none";
//   }
//
//   return errorCounter;
// }

// function validateSurname() {
//   var errorCounter = 0;
//   var surnameFld = document.getElementById("surname");
//   var surnameErr = document.getElementById("surnameError");
//
//   if (surnameFld.value.length <= 0) {
//     surnameFld.style.background = '#ce0505';
//     surnameErr.style.display = "block";
//     surnameErr.style.color = "#ce0505";
//     errorCounter++;
//   } else {
//     surnameFld.style.background = '#106c10';
//     surnameErr.style.display = "none";
//   }

//   return errorCounter;
// }

function validateEmail() {
  var errorCounter = 0;
  var re = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
  var emailFld = document.getElementById("email");
  var emailErr = document.getElementById("emailError");
  var validationErr = document.getElementById("validationErr");

  if (emailFld.value <= 0) {
    validationErr.style.display = "none";
    emailFld.style.background = '#ce0505';
    emailErr.style.display = "block";
    emailErr.style.color = "#ce0505";
    errorCounter++;
  } else {
    if (!re.test(String(emailFld.value).toLowerCase())) {
      emailErr.style.display = "none";
      emailFld.style.background = '#ce0505';
      validationErr.style.display = "block";
      validationErr.style.color = "#ce0505";
      errorCounter++;
    } else {
      emailFld.style.background = '#106c10';
      emailErr.style.display = "none";
      validationErr.style.display = "none";
    }
  }

  return errorCounter;
}

function validatePass() {
  var errorCounter = 0;
  var passFld = document.getElementById("password");
  var passErr = document.getElementById("passwordError");

  if (passFld.value.length < 8) {
    passFld.style.background = '#ce0505';
    passErr.style.display = "block";
    passErr.style.color = "#ce0505";
    errorCounter++;
  } else {
    passFld.style.background = '#106c10';
    passErr.style.display = "none";
  }

  return errorCounter;
}

function validateRepeatPass() {
  var errorCounter = 0;
  var passFld = document.getElementById("password");
  var repeatPassFld = document.getElementById("repeatPswd");
  var repeatPassErr = document.getElementById("repeatPassError");
  var matchingErr = document.getElementById("matchingError");

  if (repeatPassFld.value.length <= 0) {
    matchingErr.style.display = "none";
    repeatPassFld.style.background = '#ce0505';
    repeatPassErr.style.display = "block";
    repeatPassErr.style.color = "#ce0505";
    errorCounter++;
  } else {
    if (passFld.value.localeCompare(repeatPassFld.value) !== 0) {
      repeatPassErr.style.display = "none";
      repeatPassFld.style.background = '#ce0505';
      matchingErr.style.display = "block";
      matchingErr.style.color = "#ce0505";
      errorCounter++;
    } else {
      repeatPassFld.style.background = '#106c10';
      matchingErr.style.display = "none";
    }
  }

  return errorCounter;
}









