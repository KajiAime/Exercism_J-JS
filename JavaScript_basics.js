/**
*In JS, to create a function requires
*the keyword "function" and
*the functions name
*/

function add(a,b){
  return a+b;
}

/**
*The return keyword and the statement that follows
*define what the function should provide.
*Even a function can be called there.
*/

function multi(a,b){
  if(b==1){
    return a;
  }
  else{
    return add(a,multi(a,b-1));
  }
}
/**
*JavaScript uses the var and let keywords for creating variables
*preferable if written in camelCase convention.
*Constants are created using the const keyword
*preferable if written in SCREAMING_SNAKE_CASE convention
*/
funtion volumeOfCone(){
  const VALUE_OF_PI = 3.14;
  let radiusOfBase = 2.0;
  let heightOfCone = 5.1;
  var volume = (VALUE_OF_PI * radiusOfBase * radiusOfBase * heightOfCone)/3;
  return volume;
}
