package p216w1;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import p056f2.AbstractC0939l;
import p074h0.i;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f23603a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f23607e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f23608f;
    public PendingIntent g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public IconCompat f23609h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f23610i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public AbstractC0939l f23611k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f23612l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f23613m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Bundle f23615o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f23618r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f23619s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Notification f23620t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ArrayList f23621u;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f23604b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f23605c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f23606d = new ArrayList();
    public boolean j = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f23614n = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f23616p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f23617q = 0;

    public p(Context context, String str) {
        Notification notification = new Notification();
        this.f23620t = notification;
        this.f23603a = context;
        this.f23618r = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f23610i = 0;
        this.f23621u = new ArrayList();
        this.f23619s = true;
    }

    public static CharSequence b(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final Notification a() {
        Notification notificationBuild;
        Bundle bundle;
        String strH;
        i iVar = new i(this);
        p pVar = (p) iVar.f16423t;
        AbstractC0939l abstractC0939l = pVar.f23611k;
        if (abstractC0939l != null) {
            abstractC0939l.g(iVar);
        }
        Notification.Builder builder = (Notification.Builder) iVar.f16422s;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26 && i10 < 24) {
            builder.setExtras((Bundle) iVar.f16424u);
            notificationBuild = builder.build();
        } else {
            notificationBuild = builder.build();
        }
        if (abstractC0939l != null) {
            pVar.f23611k.getClass();
        }
        if (abstractC0939l != null && (bundle = notificationBuild.extras) != null && (strH = abstractC0939l.h()) != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", strH);
        }
        return notificationBuild;
    }

    public final void c(int i10, boolean z10) {
        Notification notification = this.f23620t;
        if (z10) {
            notification.flags = i10 | notification.flags;
        } else {
            notification.flags = (~i10) & notification.flags;
        }
    }

    public final void d(AbstractC0939l abstractC0939l) {
        if (this.f23611k != abstractC0939l) {
            this.f23611k = abstractC0939l;
            if (((p) abstractC0939l.f16104r) != this) {
                abstractC0939l.f16104r = this;
                d(abstractC0939l);
            }
        }
    }
}
