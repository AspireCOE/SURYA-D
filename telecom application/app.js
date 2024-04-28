
document.getElementById("signinbutton").addEventListener("click", function() {
    var username = document.getElementById("Username").value;
    var password = document.getElementById("UserPassword").value;
    
    
    if (username === "6379230500" && password === "123456") {
      alert("Sign in successful!");
    } else {
      alert("Incorrect username or password. Please try again.");
    }
  });