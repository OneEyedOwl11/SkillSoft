window.onload = function (e) {
  var senior = 5;
  var age = 31;
  if (age < 30) {
    senior += 1;
  } else if (age > 50) {
    senior += 5;
  }

  var person = {
    firstName: "Bob",
    lastName: "smith",
    seniority: senior,
  };

  console.log(person);
  //var this = that + somethingElse;
  //var that = 2;
  //var somethingElse = 22;
  //var employee = {
  //department: "Shhipping",
  //name: "Bob"
  //}

  // object.method()
  //var name employee.firstName()
};
