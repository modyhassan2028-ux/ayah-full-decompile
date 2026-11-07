package A5;

import io.realm.RealmFieldTypeConstants;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import p110k9.y;
import p120l9.r;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements p241y9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f545r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p241y9.a f546s;

    public /* synthetic */ c(int i10, p241y9.a aVar) {
        this.f545r = i10;
        this.f546s = aVar;
    }

    @Override // p241y9.a
    public final Object invoke() {
        switch (this.f545r) {
            case 0:
                this.f546s.invoke();
                break;
            case 1:
                this.f546s.invoke();
                break;
            case 2:
                this.f546s.invoke();
                break;
            case 3:
                this.f546s.invoke();
                break;
            case 4:
                this.f546s.invoke();
                break;
            case 5:
                this.f546s.invoke();
                break;
            case 6:
                this.f546s.invoke();
                break;
            case 7:
                p241y9.a aVar = this.f546s;
                if (aVar != null) {
                    aVar.invoke();
                }
                return y.f19095a;
            case 8:
                this.f546s.invoke();
                break;
            case 9:
                this.f546s.invoke();
                break;
            case 10:
                this.f546s.invoke();
                break;
            case 11:
                this.f546s.invoke();
                break;
            case 12:
                this.f546s.invoke();
                break;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                try {
                    return (List) this.f546s.invoke();
                } catch (SSLPeerUnverifiedException unused) {
                    return r.f19440r;
                }
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                this.f546s.invoke();
                break;
            default:
                this.f546s.invoke();
                break;
        }
        return y.f19095a;
    }
}
