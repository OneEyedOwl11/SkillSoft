function formCheck() {
  /*
    Gather all variables for targeting DOM elements
    */
  //Get form input field values
  var a = document.forms["testform"]["username"].value;
  var b = document.forms["testform"]["userid"].value;
  var psd = document.forms["testform"]["pswrd"].value;
  var grg = document.forms["testform"]["garage"].value;

  //Select input fields for styling
  var namefield = document.getElementById("un");
  var idfield = document.getElementById("ui");
  var psdfield = document.getElementById("pswr");
  var grgfield = document.getElementById("grg");

  //Select error messages in the markup for display
  var pEmptyName = document.getElementById("nameEmpty");
  var pNotAlpha = document.getElementById("nameNotAlpha");

  var pEmptyId = document.getElementById("idEmpty");
  var pNanId = document.getElementById("idNotNumber");
  var pLimId = document.getElementById("idLimits");

  var pEmptyPass = document.getElementById("pswdEmpty");
  var pInvPass = document.getElementById("pswdInvalid");

  var pEmptyGrg = document.getElementById("grgEmpty");

  /*
   * Display error messages based on condition
   */

  //Check empty user name submission
  if (a == null || a == "") {
    //alert("Error: You must provide a user name");
    namefield.style.border = "1px solid red";
    pEmptyName.style.visibility = "visible";
  }
  //Check empty password submission
  if (psd == null || psd == "") {
    //alert("Error: Password field must be filled");
    psdfield.style.border = "1px solid red";
    pEmptyPass.style.visibility = "visible";
  }

  //Check empty garage submission
  if (grg == null || grg == "") {
  }
  //Check empty user ID submission
  if (b == null || b == "") {
    //alert("Error: User ID field must not be empty");
    idfield.style.border = "1px solid red";
    pEmptyId.style.visibility = "visible";
  }

  //Check user name input is alphanumeric
  if (a.match(/[_\W]/)) {
    //alert("Error: User name field must contain alphanumeric characters only");
    namefield.style.border = "1px solid red";
    pNotAlpha.style.visibility = "visible";
  }

  //Check valid password
  if (psd != "p8ss") {
    //alert("Error: Invalid password");
    psdfield.style.border = "1px solid red";
    pInvPass.style.visibility = "visible";
  }

  //Check that user ID is a valid number
  if (!isNumber(b)) {
    //alert("Error: User ID field must contain numbers only");
    idfield.style.border = "1px solid red";
    pNanId.style.visibility = "visible";
  }

  //Check that user ID is in range [1000,2000]
  if (b <= 1000 || b >= 2000) {
    //alert("Error: Valid user ID is between 1000 and 2000");
    idfield.style.border = "1px solid red";
    pLimId.style.visibility = "visible";
  } else {
    //Successful submission
    alert("Congratulations, you have successfully submitted the form");
  }
}

/*
    Tests for a finite number
    */
function isNumber(n) {
  return !isNaN(parseFloat(n)) && isFinite(n);
}
