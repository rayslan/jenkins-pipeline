node {
    properties([buildDiscarder(logRotator(artifactDaysToKeepStr: '', artifactNumToKeepStr: '', daysToKeepStr: '', numToKeepStr: '2'))])


    timestamps {
        stage('Download Repo') {
             git 'https://github.com/rayslan/terraform-aws-ec2.git'
             }

        stage('Download Repo') {
             sh '''terraform init
                terraform destroy --auto-approve'''
             }


        

    

}
}