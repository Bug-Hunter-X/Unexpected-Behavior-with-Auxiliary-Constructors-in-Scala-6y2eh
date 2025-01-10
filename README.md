# Scala Auxiliary Constructor Bug

This repository demonstrates a potential issue when using auxiliary constructors in Scala. If you define an auxiliary constructor and then provide a value for the primary constructor's parameter(s) in an anonymous class instantiation, the auxiliary constructor might not be called as intended, leading to unexpected results.

## Problem
The auxiliary constructor in the `MyClass` class is designed to initialize `value` to 0 if no argument is provided during instantiation. However, when creating `myInstance3` using an anonymous class, the value `10` overrides the value set by the auxiliary constructor, even though the auxiliary constructor is seemingly called implicitly. This might not always be obvious and lead to subtle bugs.