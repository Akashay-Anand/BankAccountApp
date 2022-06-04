package BankAccountApp;

// [Note-1]: 'interface' ;
// [Note-2]: Why using interface insted of class ;
public interface BaseRate {
    
    // Write a method that returns the base rate.
    default double getBaseRate(){       // [Note-3]
        return 2.5;
    }
}


/*
 * [Note-1]: An 'interface' is an 'abstract' 'class' that is used to group related methods with "empty" bodies:
 * Becouse it is also a 'abstract' class we can not create a object for it. So we need to 'implements' it in other class
 * # interface class only holds method definition. just use for mantening methods 
 * 
 * [Note-2]: Base rate is something that can be declared by third party or may be change frequently. for that we can use 'API' to fetch it from somewhere.
 * So 'interface' only contains method definition, it is usefull for security perpos.
 * and another fact is that, with 'inheritence' there is restriction like we can only extend one class. But with 'interface' we don't have such restriction.
 * 
 * [Note-3]: Using 'public' insted of defoult will generate error for body ?...
 * 
 * 
 */