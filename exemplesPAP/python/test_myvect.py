import unittest
import myvect

class TestMyMath(unittest.TestCase):
    
    def test_RechercheBin(self):
        v1 = [ 3, 5, 8, 20, 30 ];
        self.assertEqual(myvect.rechercheBin(v1,5),1)
        self.assertEqual(myvect.rechercheBin(v1,30),4)
        self.assertEqual(myvect.rechercheBin(v1,3),0)
        self.assertEqual(myvect.rechercheBin(v1,20),3)
        self.assertEqual(myvect.rechercheBin(v1,-5),-1)
        self.assertEqual(myvect.rechercheBin(v1,19),-1)
        self.assertEqual(myvect.rechercheBin(v1,32),-1)
       
        
   
if __name__ == "__main__":
    unittest.main()