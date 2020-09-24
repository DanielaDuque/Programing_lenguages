# Lenjuages de Programación

Repo for the programming languages class fall 2020  
Members : 
  - DanielaDuque
  - vbernalb
  - jhonatan247

### Test

This guide follows the recommended project structure for testing given [here](https://stackoverflow.com/questions/1896918/running-unittest-with-typical-test-directory-structure) 

#### How to use ?
This repo uses a python library called `unittest`, which allows testing as a command line tool. This [site](https://realpython.com/python-testing/) offers an introduction, but you can always check the [docs](https://docs.python.org/3/library/unittest.html).  

##### Examples

For checking all test:
```shell
$ cd 
$ python3 -m unittest
```

For checking a single set of tests, in this case characters:
```shell
$ cd Analizador lexico
$ python3 -m unittest tests.testCharacters
```
