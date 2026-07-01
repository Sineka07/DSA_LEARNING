class Solution {
    vector<int> nextSmallerLeft(vector<int>& arr){
        int n=arr.size();
        stack<pair<int,int>> st;
        vector<int> ans;
        for(int i=0;i<n;i++){
            int elem=arr[i];
            if(st.empty()){
                ans.push_back(-1);
            }else if(!st.empty()&&st.top().first<elem){
                ans.push_back(st.top().second);
            }else if(!st.empty()&& st.top().first>=elem){
                while(!st.empty()&&st.top().first>=elem){
                    st.pop();
                }
                if(st.empty()){
                    ans.push_back(-1);
                }else{
                    ans.push_back(st.top().second);
                }
            }
            st.push({elem,i});
        }
        return ans;
    }
    vector<int> nextSmallerRight(vector<int>& arr){
        int n=arr.size();
        stack<pair<int,int>> st;
        vector<int> ans;
        for(int i=n-1;i>=0;i--){
            int elem=arr[i];
            if(st.empty()){
                ans.push_back(n);
            }else if(!st.empty()&&st.top().first<elem){
                ans.push_back(st.top().second);
            }else if(!st.empty() && st.top().first>=elem){
                while(!st.empty() && st.top().first>=elem){
                    st.pop();
                }
                if(st.empty()){
                    ans.push_back(n);
                }else{
                    ans.push_back(st.top().second);
                }
            }
            st.push({elem,i});
        }
        reverse(ans.begin(),ans.end());
        return ans;
    }
    int getMaxAreaHistogram(vector<int> &arr) {
        int n=arr.size();
        vector<int> nsl=nextSmallerLeft(arr);
        vector<int> nsr=nextSmallerRight(arr);
        
        int max_area=0;
        for(int i=0;i<n;i++){
            int width=nsr[i]-nsl[i]-1;
            int height=arr[i];
            int area=width*height;
            max_area=max(area,max_area);
        }
        return max_area;
    }

  public:
    int maxArea(vector<vector<int>>& mat) {
        if(mat.empty()) return 0;
        
        int num_rows = mat.size();
        int num_cols = mat[0].size();
        
        vector<int> histogram(num_cols, 0);
        int max_rectangle_area = 0;
        
        for(int i = 0; i < num_rows; i++) {
            for(int j = 0; j < num_cols; j++) {
                if(mat[i][j] == 0) {
                    histogram[j] = 0; 
                } else {
                    histogram[j] += 1; 
                }
            }
            max_rectangle_area = max(max_rectangle_area, getMaxAreaHistogram(histogram));
        }
        return max_rectangle_area;
    }
};
