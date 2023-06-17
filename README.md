# BirdRescueStation

This project implements several classifications of birds (derived in part from BioExplorer.net) including:
 - Bird of prey: birds with sharp, hooked beaks with visible nostrils. 
 - Flightless birds: live on the ground and have no or undeveloped wings.
 - Owls: distinguished by the facial disks and nocturnality.
 - Parrots: known for their intelligence and ability to mimic sounds.
 - Pigeons: known for feeding their young "bird milk" similar to the milk of mammals.
 - Shorebirds and Waterfowls - subclasses of birds that live near a water source
 - Birds of other types

Each class tracks:
 - the type of bird
 - defining characteristics
 - extinct status
 - number of wings
 - preferred food from an existing food-list
 - weight
 - migratory behavior
Each subclass has its unique attributes that describe the type of bird


A bird rescue station (Conservatory) has also been set up that allows:
 - rescue new birds and bring them into the station
 - assign a rescued bird to an aviary in the station
    * there are 20 aviaries in the station
    * any bird can be inserted into an empty aviary
    * no aviary can house more than 5 birds
    * no extinct birds can be added to an aviary
    * flightless birds, birds of prey, and waterfowl should not be mixed with other birds
 - look up which aviary a bird is in
 - print a sign for any given aviary location
 - print a map that lists all aviaries and birds they house with information
 - print an index that lists all birds rescued in alphabetical order and their respective aviary location
