package Session5;


/*

Permitted subclasses must declare one of:

final → cannot be extended further

sealed → can continue sealed hierarchy

non-sealed → open for inheritance

*/

sealed public class SealedClass  permits Circle, Square{
    
}

// non-sealed class Dog extends SealedClass { }

// sealed class GermanShepherd extends Dog permits WhiteShepherd { }

// non-sealed class WhiteShepherd extends GermanShepherd {

    
// }

