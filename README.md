# Generated Web3j-OpenAPI demo project

This project was generated using the [Epirus-CLI](https://github.com/epirus-io/epirus-cli) as follows:
```
epirus openapi generate --package-name com.gen.app --name=HelloWorldApp --abi=helloworld.abi --bin=helloworld.bin
```
On the following contract:

```
pragma solidity ^0.6.0;

contract HelloWorld {
 function hello() public pure returns (string memory) {
   return 'Hello Web3j-OpenAPI';
 }
 
 function sayIt(string memory greeting) public pure returns (string memory) {
   return greeting;
 }
}
```

## How to build

To build the project, you clone the project:

```ssh
$ git clone https://github.com/web3j/Web3j-OpenAPI-demo && cd Web3j-OpenAPI-demo
```
  
And then, you have two possibilities:

#### Generate the ShadowJAR
`./gradlew shadowJar` Which you can find in the `server/build/libs` folder.

#### Generate the distributions
`./gradlew installDist` Which you can find in the `server/build/install/HelloWorldProject-server/bin` folder.

## Configurations
In all cases, we need to specify the runtime configuration. 

For example, the `private key` or `wallet file` for the signing, the `node endpoint` to connect to, etc.

To see the available options, try to run the `distributions` or the `JAR` with the `--help` flag. You'll get the following display:

![](https://raw.githubusercontent.com/SweeXordious/Web3j-OpenAPI-demo/master/img/Server_help.png)

To specify these parameters, we have three ways:

#### Environment variables
The rule is to:
- Replace the `-` with a `_` : `private-key => private_key`
- Upper case the options' names : `private-key => PRIVATE_KEY`

And export them:
	`Export PRIVATE_KEY={your private key} `

#### Configuration file
We can pass in a configuration file in two ways:

##### Via an environment variable
```
Export CONFIG_FILE={the path to the config file}
```
##### Via the CLI
```
--config--file {path to file}
```
Also, there is the possibility to put the config file in the default directory: `~/.epirus/web3j.openapi.properties`

A configuration file is similar to the following:
```
web3j.openapi.private.key={your private key}
web3j.openapi.port=9090
```
#### Directly from the CLI
The usual way:  `--private-key {your private key}`

Then, we are ready to run the project.

## Run the project
We can run the project directly : `./gradlew run`
However, specifying the runtime parameters in this case from the CLI is tricky. For this case, either use environment variables or Default Configuration file as stated above.

#### Run the FatJAR
```ssh
$ java -jar server/build/libs/HelloWorldProject-server-all.jar [arguments]
```

#### Run the distributions binary
```ssh
$ ./server/build/install/HelloWorldProject-server/bin/HelloWorldProject-server [arguments]
```

You should be able to run the server and see the following:

![](https://raw.githubusercontent.com/SweeXordious/Web3j-OpenAPI-demo/master/img/Server_logs.png)

