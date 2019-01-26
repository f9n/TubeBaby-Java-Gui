# Development

## Usage ##
Import repository your Eclipse.

## How it was done ##
<h6>First set up PostgreSql, Java(Jvm), Eclipse.</h6>
<p>1- Created java project on Eclipse.<p> 
<p>2- Created Main.java, Database.java.</p>
3- Imported [postgresql driver](https://jdbc.postgresql.org/download.html)
<ul>
  <li>Right click on project</li>
  <li>Choosed Properties</li>
  <li>Choosed Java build path</li>
  <li>Choosed Libraries</li>
  <li>Choosed add external JARS</li>
  <li>Then select the location to the JDBC driver.</li>
</ul>
<p>4- Created PostgreSql user, password, database</p>
<ul>
  <li>
    <p>Go to Console,and writed this command:
    <code>$ su - postgres</code></p>
    <p>And, we should this prompt:
    <code>-bash-4.3$</code></p>
  </li>
  <li>
    <p>Created user, password, database.</p>
    <p>Created <b>geekpeek</b> and password(geekpeek):
    <code>-bash-4.3$ createuser -Pdr geekpeek</code></p>
    <p>Created <b>tubebaby</b> database: 
    <code>-bash-4.3$ createdb -O geekpeek tubebaby</code></p>
  </li>
</ul>


## Sources ##
<ul>
  <li>http://www.vogella.com/tutorials/EclipseGit/article.html</li>
  <li>https://geekpeek.net/postgresql-create-user/</li>
  <li>https://geekpeek.net/postgresql-create-database-tablespace/</li>
  <li>https://www.tutorialspoint.com/postgresql/postgresql_java.htm</li>
</ul>
