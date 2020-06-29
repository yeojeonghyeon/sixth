// findUser(1).then(function (user) {
//   console.log("user:", user)
// });

findUser(1).then(function(user){
  console.dir(user);
});

function findUser(id) {
  return new Promise(function (resolve) {
    setTimeout(function () {
      console.log("waited 0.1 sec.")
      const user = {
        id: id,
        name: "User" + id,
        email: id + "@test.com",
      }
      resolve(user)
    }, 100)
  })
}