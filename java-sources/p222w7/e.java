package p222w7;

import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f23767c;

    public e(int i10) {
        this.f23765a = i10;
    }

    public final int a() {
        switch (this.f23766b) {
            case 0:
                return this.f23767c.f1727o;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f23767c;
                return carouselLayoutManager.f1727o - carouselLayoutManager.D();
        }
    }

    public final int b() {
        switch (this.f23766b) {
            case 0:
                return this.f23767c.E();
            default:
                return 0;
        }
    }

    public final int c() {
        switch (this.f23766b) {
            case 0:
                CarouselLayoutManager carouselLayoutManager = this.f23767c;
                return carouselLayoutManager.f1726n - carouselLayoutManager.F();
            default:
                return this.f23767c.f1726n;
        }
    }

    public final int d() {
        switch (this.f23766b) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f23767c;
                if (carouselLayoutManager.S0()) {
                    return carouselLayoutManager.f1726n;
                }
                return 0;
        }
    }

    public final int e() {
        switch (this.f23766b) {
            case 0:
                return 0;
            default:
                return this.f23767c.G();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(CarouselLayoutManager carouselLayoutManager, int i10) {
        this(1);
        this.f23766b = i10;
        switch (i10) {
            case 1:
                this.f23767c = carouselLayoutManager;
                this(0);
                break;
            default:
                this.f23767c = carouselLayoutManager;
                break;
        }
    }
}
