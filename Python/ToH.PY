def solve(disks,source,middle,destination) :
      if disks==0:
        print("Plate ",disks," from ",source," to ",destination);
        return;
      solve(disks-1,source,destination,middle);
      print("Plate ",disks," from ",source," to ",destination);
      solve(disks-1,middle,source,destination);
  
solve(3,'A','B','C');
