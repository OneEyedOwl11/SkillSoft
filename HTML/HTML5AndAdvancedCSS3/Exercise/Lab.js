function doTxform() {
  /*
   * Create variables for selecting DOM elements
   */
  var pInfo = document.getElementById("info"); //selects the <p> tag
  var div1 = document.getElementById("tx1"); //selects first <div> element for transformation
  var div2 = document.getElementById("tx2"); //selects second <div> element for transformation
  var div3 = document.getElementById("tx3"); //selects third <div> element for transformation
  var bodyCont = document.getElementById("cont"); //selects DOM parent element for <div> elements
  var btn = document.getElementById("btn"); //selects the button

  /*
   * Add transform class to each <div> element
   */
  div1.classList.add("txformX"); //perform X-axis transform
  div2.classList.add("txformY"); //perform Y-axis transform
  div3.classList.add("txformZ"); //perform Z-axis transform

  /*
   * Place text inside new <div> elements
   */
  div1.innerHTML = "X-axis TXFRM";
  div2.innerHTML = "Y-axis TXFRM";
  div3.innerHTML = "Z-axis TXFRM";

  /*
   * Remove the button after transformations commence and change text in <p> tag
   */
  bodyCont.removeChild(btn);
  pInfo.innerHTML =
    "Refresh the page then press the button to see the transformations again";
} //end doTxform()
