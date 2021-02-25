Pre-requsite to setup this project:

- Enable free tier GCP Account https://cloud.google.com/free/docs/gcp-free-tier
- Install Google cloud SDK https://cloud.google.com/sdk/docs/install
- Install Google Cloud Plugin for Eclipse 
  Details: https://cloud.google.com/eclipse/docs
- In Eclipse, using Google Cloud Platform Plugin, sign-in to your google account
- Sample File Creation:
     - Open GCP Console
     - Create project named gcp-hackathon-demo-project (give same as project id).
     - Open gcp-hackathon-demo-project
     - Go to Cloud Storage, create bucket called demobucket_gcp
     - Upload sample text file named my-file.txt
     
Notes:
- Make sure to have JDK8 as JRE/Build environment
- You can configure project id and bucket name in src\main\resources\application.properties
- Make sure to specify service name in src\main\appengine\app.yaml. As of now, it is app-engine-sb-hackdemo. You may configure it. 

To deploy on App Engine:
- Run below maven goal from Eclipse

   clean package appengine:deploy


 

