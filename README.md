# JEE_IOC_PRINCIPE

This sample gives an idea how IOC (Inversion Of Control) and DI (Dependencey Injection) are working using frameworks like Spring Framework or EJB, it gives you how all that frameworks can facilitate and manage a couple hundreds of dependencies in a real-life applications.

The sample start by using a static method (Presentation class) and it's based on injecting dependencies using the static way, so we can instanciate the class which we would like to use in the business layer. 

The Presentation class (PresentationV2) implements a new strategy to inject those dependencies into the Business Layer, and it's based on a file (Place the file into the source /src if you want to get the result), so we read the lines on the file and we can get those dependencies, actually we can get the same results by using Spring by reading on config.xml file or using annotations.
