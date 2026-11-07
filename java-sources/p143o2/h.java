package p143o2;

import android.content.Context;
import android.os.Bundle;
import android.service.media.MediaBrowserService;
import android.support.v4.media.session.r;

/* JADX INFO: loaded from: classes.dex */
public final class h extends g {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ i f20280t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, Context context) {
        super(iVar, context);
        this.f20280t = iVar;
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadChildren(String str, MediaBrowserService.Result result, Bundle bundle) {
        r.C(bundle);
        this.f20280t.g.b();
    }
}
