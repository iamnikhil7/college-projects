const submitBtn = document.querySelector(".submit_btn");
const email = document.querySelector(".email");
const password = document.querySelector(".password");
const alert = document.querySelector(".alert");

submitBtn.addEventListener("click", (e) => {
  e.preventDefault();
  let email_value = email.value;
  let password_value = password.value;
  if (!email_value || !password_value) {
    alert.classList.add("show-alert");
    setTimeout(() => {
      alert.classList.remove("show-alert");
    }, 3000);
  }
});