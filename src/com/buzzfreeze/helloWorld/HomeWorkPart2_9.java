package com.buzzfreeze.helloWorld;

public class HomeWorkPart2_9 {

	public class MobilePhone {

		public void PhoneCall() {

		}

		public void SMS() {

		}
		

		public void InternetSurfing() {

		}
		
		public void UseGearVR() {

		}

		public void TransformToPC() {

		}

		public void GooglePlay() {

		}
		
		public void AppStore() {

		}

	}
	
	public class SamSungGalaxyNote8 extends MobilePhone {


		public void UsePen() {

		}
		
		@Override
		public void UseGearVR() {
			// TODO Auto-generated method stub
			super.UseGearVR();
		}
		@Override
		public void TransformToPC() {
			// TODO Auto-generated method stub
			super.TransformToPC();
		}
		
		@Override
		public void GooglePlay() {
			// TODO Auto-generated method stub
			super.GooglePlay();
		}
	}
	
	public class SamSungGalaxyS8 extends MobilePhone{

		@Override
		public void UseGearVR() {
			// TODO Auto-generated method stub
			super.UseGearVR();
		}
		
		@Override
		public void TransformToPC() {
			// TODO Auto-generated method stub
			super.TransformToPC();
		}
		
		@Override
		public void GooglePlay() {
			// TODO Auto-generated method stub
			super.GooglePlay();
		}
	}
	
	public class IPhoneX extends MobilePhone{
		
		public void FaceID() {

		}

		@Override
		public void AppStore() {
			// TODO Auto-generated method stub
			super.AppStore();
		}


	}
	
	public class IPhone8  extends MobilePhone{
		public void TouchID() {

		}

		@Override
		public void AppStore() {
			// TODO Auto-generated method stub
			super.AppStore();
		}

	}


}
