package missdumbo.codebase.dp.creationalmode.builder;

public class ChatBackGroundBuilder implements BackgroundBuilder {
	
	private BackgroundProduct product;
	
	public ChatBackGroundBuilder() {
		product = new BackgroundProduct();
	}

	@Override
	public void buildBackImage() {
		product.setBackImage("ChatBackGroundBuilder buildBackImage call");
	}

	@Override
	public void buildBackSize() {
		product.setBackSize("ChatBackGroundBuilder buildBackSize call");
	}

	@Override
	public void buildBackFont() {
		product.setBackFont("ChatBackGroundBuilder buildBackFont call");
	}

	@Override
	public BackgroundProduct getBackgroundProduct() {
		return product;
	}

}
