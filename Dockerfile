FROM openjdk:8
ARG SBT_VERSION=1.7.1

# Install sbt
RUN curl -L -o sbt-$SBT_VERSION.zip https://github.com/sbt/sbt/releases/download/v$SBT_VERSION/sbt-$SBT_VERSION.zip
RUN unzip sbt-$SBT_VERSION.zip -d ops

# Create a working directory
WORKDIR /conways-game-of-life

# Add project contents to the project's working directory
ADD . /conways-game-of-life

# Run the code
CMD /ops/sbt/bin/sbt run
