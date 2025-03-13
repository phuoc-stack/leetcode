/**
 * @return {Function}
 */
var createHelloWorld = function() {
    
    return function(...args) {
        return "Hello World";
        
    }

};
// createHelloWorld([1,2])
 const f = createHelloWorld();
 f(); // "Hello World"
