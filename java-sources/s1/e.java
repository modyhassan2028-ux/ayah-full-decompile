package s1;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f21924b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f21925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f21926d;

    public e(Context context, XmlResourceParser xmlResourceParser) {
        this.f21925c = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), p.f22051q);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == 0) {
                this.f21923a = typedArrayObtainStyledAttributes.getResourceId(index, this.f21923a);
            } else if (index == 1) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f21925c);
                this.f21925c = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    l lVar = new l();
                    this.f21926d = lVar;
                    lVar.d((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
