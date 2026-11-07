package p013b2;

import B9.a;
import U6.y;
import android.content.Context;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class n implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f13172a;

    public n(Context context, int i10) {
        switch (i10) {
            case 1:
                y.f(context);
                Context applicationContext = context.getApplicationContext();
                y.f(applicationContext);
                this.f13172a = applicationContext;
                break;
            case 2:
                this.f13172a = context;
                break;
            default:
                this.f13172a = context.getApplicationContext();
                break;
        }
    }

    @Override // p013b2.i
    public void a(a aVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0775a("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new l(this, aVar, threadPoolExecutor, 0));
    }
}
