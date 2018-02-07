package missdumbo.codebase.dp.structuralmode.bridge;

public class LinuxPlayerPlatform extends PlayerPlatform{

	public LinuxPlayerPlatform(MediaType type) {
		this.type = type;
	}
	
	@Override
	public void play() {
		System.out.println("LinuxPlayerPlatform play call");
		type.typeValue();
	}
}
