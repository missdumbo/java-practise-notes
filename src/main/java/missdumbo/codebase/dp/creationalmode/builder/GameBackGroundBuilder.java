package missdumbo.codebase.dp.creationalmode.builder;

public class GameBackGroundBuilder implements BackgroundBuilder {
	
	private BackgroundProduct product;

	public GameBackGroundBuilder() {
		product = new BackgroundProduct();
	}
	
	@Override
	public void buildBackImage() {
		product.setBackImage("GameBackGroundBuilder buildBackImage call");
	}

	@Override
	public void buildBackSize() {
		product.setBackSize("GameBackGroundBuilder buildBackSize call");
	}

	@Override
	public void buildBackFont() {
		product.setBackFont("GameBackGroundBuilder buildBackFont call");
	}

	@Override
	public BackgroundProduct getBackgroundProduct() {
		return product;
	}

}
