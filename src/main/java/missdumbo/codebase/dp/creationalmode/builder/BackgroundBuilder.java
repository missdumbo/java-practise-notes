package missdumbo.codebase.dp.creationalmode.builder;

public interface BackgroundBuilder {
	void buildBackImage();
	void buildBackSize();
	void buildBackFont();
	BackgroundProduct getBackgroundProduct();
}
