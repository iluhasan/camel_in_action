# Meeting Camel

* You can integrate different components together using camel.
* Camel is an integration framework that aims to make your integration projects productive and fun.

#### What is Camel?

* At the core of the Camel framework is a routing engine.
* It allows you to define your own routing rules. 
* Decide from which sources to accept messages.
* Determine how to process and send those messages to other destinations.
* One of the fundamental principle of Camel is that it makes no assumptions about the type of data you need to process.
    * This gives developer a chance to integrate any kind of system because developer is not tied to canonical form of data.
* Camel is the glue between disparate systems.
    * Camel offers higher-level abstractions that allow you to interact with various systems by using the same API regardless of the protocol or data type the systems are using.
* Components in Camel offer specific implementation of different protocols and data formats
* Out of the box, Camel comes with support for more than 280 protocols and data types.
* Some of the open source projects use Camel as a way to carry out integration.
    * ActiveMQ
    * Karaf
    * Apache ServiceMix

#### Why use Camel?

* Main features of Camel as follows.
  * Routing and Mediation engine.
      * A routing engine selectively moves a message around, based on the routes configuration.  
      * In Camel's case routes are configured with a combination of enterprise integration patterns and a DSL
  * Extensive component library.
      * Camel has over 280 components
      * These components are used for transformation of data, using and connecting other APIs
  * Enterprise integration patterns.
  * Domain specific language.
  * Payload-agnostic router.
      * Camel can route any kind of payload;
      * You aren't restricted to carrying a normalized format such as XML payloads.
  * Plain Old Java Object Model.
  * Easy configuration.
  * Lightweight core ideal for micro services.
      * Camel's core can be considered lightweight, with the total library coming in at about 4.9 MB and having only 1.3 MB of runtime dependencies.
      * This makes Camel easy to embed or deploy anywhere you like, such as in a standalone application, micro-service, web application, Spring application, Java EE application, OSGi, Spring Boot, WildFly, and in cloud platforms such as AWS, Kubernetes, and Cloud Foundry

#### Getting Started

* Camel is available from the official Apache Camel website at http://camel.apache.org/download.html
* Camel distribution includes following contents
  * doc  
      * Contains Camel documentation
  * examples  
      * Contains examples projects for teaching purposes
  * lib
      * Contains all Camel libraries
  * LICENSE.txt
      * Contains license of the Camel distribution
  * NOTICE.txt  
      * Contains copyright information for third party dependencies
  * README.txt
      * Contains a short intro to Camel and list of helpful links to get new users up and running 

#### Your First Camel Ride

* Every Camel application uses a CamelContext that's subsequently started and stopped.