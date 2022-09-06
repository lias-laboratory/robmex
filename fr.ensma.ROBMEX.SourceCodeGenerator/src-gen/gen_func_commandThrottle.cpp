
// AUTOMATICALLY GENERATED FILE FOR: commandThrottle

// Structs:
	
	

// Global Variables:
	 bool  reverse; 
	 long double  [4] motorArray; 

void main_commandThrottle() {
		 long double  motorBasePower  = 100 ;
		 long double  affectingPower ;
		 long long int  i ;
	  if ( (reverse)  ==  (true) ) {
	 		affectingPower =  (motorBasePower)  *  (-1)  ; 
	 	}  else {
	 		affectingPower = motorBasePower ; 
	 	}
	  while ( (i)  <  (4) ) {
	 		motorArray[i] = affectingPower ;
	 		i =  (i)  +  (1)  ; 
	 	} 
	  
}

