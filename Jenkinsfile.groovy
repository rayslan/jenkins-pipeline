node {
    properties([buildDiscarder(logRotator(artifactDaysToKeepStr: '', artifactNumToKeepStr: '', daysToKeepStr: '', numToKeepStr: '2'))])


    timestamps {
        stage('Download Repo') {
             git 'https://github.com/rayslan/terraform-aws-ec2.git'
             }
        stage('Update Debian') {
            sh '''terraform init
                terraform apply --auto-approve'''       
        }

    

}
}