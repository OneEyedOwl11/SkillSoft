window.onload = function (e) {
  var carChoice = "";
  var carsForSale = ["Honda", "Mazda", "Suzuki"];

  for (i = 0; i < carsForSale; i++) {
    carChoice = carsForSale[i];
    document.getElementById("output").innerHTML = carChoice;
  }
};
