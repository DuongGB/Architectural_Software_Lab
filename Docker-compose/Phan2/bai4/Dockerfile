# Sử dụng image node chính thức
FROM node:18

# Tạo thư mục trong container
WORKDIR /app

# Copy file cấu hình và source code
COPY package*.json ./
RUN npm install
COPY . .

# Expose cổng 3000
EXPOSE 3000

# Lệnh chạy app
CMD ["npm", "start"]
