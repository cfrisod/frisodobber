import { FdAngular2Page } from './app.po';

describe('fd-angular2 App', function() {
  let page: FdAngular2Page;

  beforeEach(() => {
    page = new FdAngular2Page();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
