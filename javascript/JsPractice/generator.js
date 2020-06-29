function* oneToX() {
    yield 1;
  
    try {
      yield 2;
    } finally {
      yield 3;
      yield 4;
    }
  
    yield 5;
  }
  
  var withReturnWithFinally = oneToX();
  
  console.log(withReturnWithFinally.next()); // { value: 1, done: false }
  console.log(withReturnWithFinally.next()); // { value: 2, done: false }
  console.log(withReturnWithFinally.return(6)); // { value: 3, done: false }
  console.log(withReturnWithFinally.next()); // { value: 4, done: false }
  console.log(withReturnWithFinally.next()); // { value: 6, done: true }