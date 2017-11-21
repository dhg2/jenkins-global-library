// Making a package declaration
package linuxacademy.git;

/* Define a function called gitCommit and pass it a gitPath, so we need to know the Git dir
 for the repo we want to return the Git commit from. */
def gitCommit(gitPath) {
  /* this line returns the SHA/commit ID. Breaking it down, it calls the gin binary 
  from the command line and we're passing it the Git dir which we accept as a parameter
  and we do a 'rev-parse HEAD' which returns the current SHA/commit ID. 
  The 'execute()' says it runs from the command line as it's a system call, and the
  ".text" returns the commit ID. */
    return "/bin/git --git-dir=${gitPath} rev-parse HEAD".execute().text
  }